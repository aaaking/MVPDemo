package mvp

import com.example.zhouzhihui.mvpdemo.R
import com.stfalcon.mvphelper.MvpActivity

/**
 * Created by 周智慧 on 2017/9/21.
 */
class DemoACActivity : MvpActivity<DemoACActivityContract.Presenter, DemoACActivityContract.View>(),
        DemoACActivityContract.View {

    override fun getLayoutResId(): Int = R.layout.activity_demo_ac

}