package cn.xdeveloper.module.gank.inject;


import cn.xdeveloper.lib.common.inject.scope.ActivityScope;
import cn.xdeveloper.module.gank.biz.girl.GirlActivity;
import cn.xdeveloper.module.gank.biz.girl.GirlModule;
import dagger.Module;
import dagger.android.ContributesAndroidInjector;

/**
 * 注册View
 * Created by laiyimin on 2017/11/30.
 */

@Module
public abstract class ViewModule {

    @ActivityScope
    @ContributesAndroidInjector(modules = GirlModule.class)
    abstract GirlActivity girlActivity();

}
