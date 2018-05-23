/*
 * Copyright 2010-2018 JetBrains s.r.o. Use of this source code is governed by the Apache 2.0 license
 * that can be found in the license/LICENSE.txt file.
 */

package org.jetbrains.kotlin.idea.internal

import org.jetbrains.java.decompiler.main.decompiler.BaseDecompiler
import java.io.File

/**
 * Method signature was changed in 182.
 * BUNCH: 182
 */
@Suppress("IncompatibleAPI")
fun BaseDecompiler.addSpaceEx(file: File, isOwn: Boolean) {
    addSpace(file, isOwn)
}