package mvp

import com.stfalcon.mvphelper.IPresenter

/**
 * Created by 周智慧 on 2017/9/21.
 */
interface DemoACActivityContract {

    interface View {

    }

    interface Presenter : IPresenter<View> {

    }
}