package com.code42.jenkins.pipelinekt.internal.`when`

import com.code42.jenkins.pipelinekt.core.When
import com.code42.jenkins.pipelinekt.core.writer.GroovyWriter
import com.code42.jenkins.pipelinekt.core.writer.ext.toGroovy

data class AnyOf(val whenStatements: List<When>) : When {
    override fun toGroovy(writer: GroovyWriter) {
        writer.closure("anyOf", whenStatements::toGroovy)
    }
}
