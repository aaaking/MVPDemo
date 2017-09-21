package mvp

import android.content.Context
import com.stfalcon.mvphelper.PresenterLoader
import dagger.Module
import dagger.Provides

/**
 * Created by 周智慧 on 2017/9/21.
 */
@Module
class DemoACActivityModule {

    @Provides
    fun providePresenterLoader(context: Context, presenter: DemoACActivityPresenter)
            : PresenterLoader<DemoACActivityContract.Presenter> = PresenterLoader(context, presenter)
}