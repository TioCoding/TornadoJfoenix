package com.example.demo.view

import com.example.demo.app.Styles.Companion.buttonLogin
import com.jfoenix.controls.JFXButton
import tornadofx.*

class MainView : View("Hello TornadoFX") {
    override val root = hbox {
        this += JFXButton("Button").apply {
            addClass(buttonLogin)
        }
    }
}