import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

class AuthenticationManagers {
    int time;
    HashMap<String, Integer> map = new HashMap<>();

    public AuthenticationManagers(int timeToLive) {this.time = timeToLive;}
    
    public void generate(String tokenId, int currentTime) {map.put(tokenId, currentTime + time);}
    
    public void renew(String tokenId, int currentTime) {
        if (!map.containsKey(tokenId) || map.get(tokenId) <= currentTime) return;
        map.put(tokenId, currentTime +time);
    }
    
    public int countUnexpiredTokens(int currentTime) {
        List<String> lst = new ArrayList<>(map.keySet());
        for (int i = 0; i < lst.size(); i++) {
            if (map.get(lst.get(i)) <= currentTime) map.remove(lst.get(i));
        }
        return map.size();
    }
}


public class AuthenticationManager {
    public static void main(String[] args){
        AuthenticationManagers authenticationManager = new AuthenticationManagers(5); // Constructs the AuthenticationManager with timeToLive = 5 seconds.
        authenticationManager.renew("aaa", 1); // No token exists with tokenId "aaa" at time 1, so nothing happens.
        authenticationManager.generate("aaa", 2); // Generates a new token with tokenId "aaa" at time 2.
        authenticationManager.countUnexpiredTokens(6); // The token with tokenId "aaa" is the only unexpired one at time 6, so return 1.
        authenticationManager.generate("bbb", 7); // Generates a new token with tokenId "bbb" at time 7.
        authenticationManager.renew("aaa", 8); // The token with tokenId "aaa" expired at time 7, and 8 >= 7, so at time 8 the renew request is ignored, and nothing happens.
        authenticationManager.renew("bbb", 10); // The token with tokenId "bbb" is unexpired at time 10, so the renew request is fulfilled and now the token will expire at time 15.
        authenticationManager.countUnexpiredTokens(15); // The token with tokenId "bbb" expires at time 15, and the token with tokenId "aaa" expired at time 7, so currently no token is unexpired, so return 0.
    }
}