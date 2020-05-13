package com.amitgupta.domain.core

interface WebEnvironment {

    enum class WebEnvironmentType { DEV, TESTING, STAGING, PRODUCTION }

    var webEnvironmentType: WebEnvironmentType

    fun baseUrl():String

}