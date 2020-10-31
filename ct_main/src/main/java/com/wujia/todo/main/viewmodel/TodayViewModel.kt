package com.wujia.todo.main.viewmodel

import com.wujia.arch.mvvm.viewmodel.BaseViewModel
import com.wujia.todo.main.data.MainRepository

class TodayViewModel: BaseViewModel<MainRepository>(){

    override fun initRepository(): MainRepository {
       return MainRepository()
    }

}