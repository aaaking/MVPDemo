package mvp

import dagger.Subcomponent
import dagger.android.AndroidInjector

/**
 * Created by 周智慧 on 2017/9/21.
 */
@Subcomponent(modules = arrayOf(DemoACActivityModule::class))
interface DemoACActivitySubComponent : AndroidInjector<DemoACActivity> {

    @Subcomponent.Builder
    abstract class Builder : AndroidInjector.Builder<DemoACActivity>()

    //TODO REMINDER: move the line below to AppModule's @Module(...) annotation
    //DemoACActivitySubComponent::class

    //TODO REMINDER: move this to ActivitiesInjectorFactories module
    @Binds
    @IntoMap
    @ActivityKey(DemoACActivity::class)
    internal abstract fun bindDemoACActivityInjectorFactory(
            builder: DemoACActivitySubComponent.Builder): AndroidInjector.Factory<out Activity>
}