package com.github.dadangsetio.templatemvpjava.services

import com.github.dadangsetio.templatemvpjava.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
