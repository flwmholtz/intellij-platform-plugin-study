package com.github.flwmholtz.intellijplatformpluginstudy.services

import com.github.flwmholtz.intellijplatformpluginstudy.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
