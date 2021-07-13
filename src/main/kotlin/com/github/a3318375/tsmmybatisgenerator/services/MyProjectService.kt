package com.github.a3318375.tsmmybatisgenerator.services

import com.github.a3318375.tsmmybatisgenerator.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
