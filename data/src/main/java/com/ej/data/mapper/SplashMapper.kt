package com.ej.data.mapper

import com.ej.data.model.splash.DataAppVersion
import com.ej.domain.model.DomainAppVersion

object SplashMapper {

    fun appVersionMapper(
        dataAppVersion : DataAppVersion?
    ) : DomainAppVersion?{
        if(dataAppVersion!=null){
            return DomainAppVersion(dataAppVersion.version)
        }
        else{
            return dataAppVersion
        }
    }
}