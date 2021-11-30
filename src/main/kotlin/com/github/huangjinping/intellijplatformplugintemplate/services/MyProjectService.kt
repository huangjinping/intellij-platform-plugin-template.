package com.github.huangjinping.intellijplatformplugintemplate.services

import com.intellij.openapi.project.Project
import com.github.huangjinping.intellijplatformplugintemplate.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
