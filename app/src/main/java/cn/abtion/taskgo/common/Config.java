package cn.abtion.taskgo.common;

/**
 * @author FanHongyu.
 * @since 18/1/17 17:51.
 * email fanhongyu@hrsoft.net.
 */

public class Config {

    /**
     * 网络请求BaseURL
     */
    public static final String APP_SERVER_BASE_URL = "http://www.thmaoqiu.cn/saiyou/public/index.php/";

    /**
     * 网络请求连接超时时间，单位：s
     */
    public static final int APP_SERVER_CONNECT_TIME_OUT = 15;


    /**
     * SwipeRefreshLayout下拉刷新时间
     */
    public final static int REFRESH_TIME = 2000;

    /**
     * InitiateActivity 的Page标记
     */
    public static final int FLAG_INITIATE_FIRST =0;
    public static final int FLAG_INITIATE_SECOND =1;
    public static final int PAGE_SUMS=2;


}
