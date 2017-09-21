package mvp

import com.stfalcon.mvphelper.Presenter
import javax.inject.Inject

/**
 * Created by 周智慧 on 2017/9/21.
 */
class DemoACActivityPresenter @Inject constructor()
    : Presenter<DemoACActivityContract.View>(), DemoACActivityContract.Presenter {

    override fun onViewAttached(view: DemoACActivityContract.View, created: Boolean) {
        super.onViewAttached(view, created)
    }

    override fun onViewDetached() {
        super.onViewDetached()
    }

    override fun onDestroy() {
        super.onDestroy()
    }
}