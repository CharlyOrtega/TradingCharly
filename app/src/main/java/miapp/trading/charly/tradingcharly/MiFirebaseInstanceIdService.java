package miapp.trading.charly.tradingcharly;
import android.util.Log;
import com.google.firebase.iid.FirebaseInstanceId;
import com.google.firebase.iid.FirebaseInstanceIdService;
/**
 * Created by Charly on 26/02/2017.
 */

public class MiFirebaseInstanceIdService extends FirebaseInstanceIdService{
    public static final String TAG = "NOTICIAS";
    @Override
    public void onTokenRefresh() {
        super.onTokenRefresh();
        String token= FirebaseInstanceId.getInstance().getToken();
        Log.d(TAG,"Token: " + token);
    }
}
