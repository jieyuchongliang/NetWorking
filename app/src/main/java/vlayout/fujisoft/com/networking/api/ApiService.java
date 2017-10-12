package vlayout.fujisoft.com.networking.api;

import retrofit2.http.GET;
import rx.Observable;

/**
 * Created by 860617010 on 2017/6/6.
 */

public interface ApiService {
    String HTTP_HOST = "http://123.232.109.129/";//实际IP
    String BASE_URL = HTTP_HOST + "RCPT/";
    String IMAGE_BASE = HTTP_HOST + "images/";

    @GET("indexapp/indexnews.app")
    Observable<Object> getHomeInstitutionList();
}
