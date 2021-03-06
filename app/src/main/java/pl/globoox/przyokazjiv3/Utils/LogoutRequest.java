package pl.globoox.przyokazjiv3.Utils;


import com.android.volley.Response;
import com.android.volley.toolbox.StringRequest;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by GlobooX on 06.06.2018.
 */

public class LogoutRequest extends StringRequest{
    private static final String LOGOUT_REQUEST_URL = "http://www.globoox.pl/przyokazji/logout.php";
    private Map<String, String> params;

    public LogoutRequest(String session, String username, Response.Listener<String> listener) {
        super(Method.POST, LOGOUT_REQUEST_URL, listener, null);
        params = new HashMap<>();
        params.put("username", username);
        params.put("session", session);
    }

    @Override
    public Map<String, String> getParams() {
        return params;
    }

}
