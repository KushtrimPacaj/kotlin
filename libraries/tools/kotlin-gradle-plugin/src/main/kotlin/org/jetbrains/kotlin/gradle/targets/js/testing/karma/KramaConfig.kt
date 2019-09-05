/*
 * Copyright 2010-2019 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the license/LICENSE.txt file.
 */

package org.jetbrains.kotlin.gradle.targets.js.testing.karma

// https://karma-runner.github.io/3.0/config/configuration-file.html
class KarmaConfig {
    var singleRun: Boolean = true
    var autoWatch: Boolean = false
    var basePath: String? = null
    val files: MutableList<String> = mutableListOf()
    val frameworks: MutableList<String> = mutableListOf()
    val browsers: MutableList<String> = mutableListOf()
    val customLaunchers: MutableMap<String, CustomLauncher> = mutableMapOf()
    val reporters: MutableList<String> = mutableListOf()
    val preprocessors: MutableMap<String, MutableList<String>> = mutableMapOf()
    var coverageReporter: CoverageReporter? = null

    class CoverageReporter(var dir: String) {
        val reporters = mutableListOf<Reporter>()

        class Reporter(
            val type: String,
            val subDir: String? = null,
            val file: String? = null
        ) {
            override fun toString(): String {
                return "Reporter(type='$type', subDir=$subDir, file=$file)"
            }
        }

        override fun toString(): String {
            return "CoverageReporter(dir='$dir', reporters=$reporters)"
        }
    }

    class CustomLauncher(var base: String) {
        val flags = mutableListOf<String>()
        var debug: Boolean? = null
    }

    override fun toString(): String {
        return "KarmaConfig(singleRun=$singleRun, autoWatch=$autoWatch, basePath=$basePath, files=$files, frameworks=$frameworks, browsers=$browsers, reporters=$reporters, preprocessors=$preprocessors, coverageReporter=$coverageReporter)"
    }
}