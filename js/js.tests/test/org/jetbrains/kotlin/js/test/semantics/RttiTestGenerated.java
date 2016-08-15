/*
 * Copyright 2010-2016 JetBrains s.r.o.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.jetbrains.kotlin.js.test.semantics;

import com.intellij.testFramework.TestDataPath;
import org.jetbrains.kotlin.test.JUnit3RunnerWithInners;
import org.jetbrains.kotlin.test.KotlinTestUtils;
import org.jetbrains.kotlin.test.TestMetadata;
import org.junit.runner.RunWith;

import java.io.File;
import java.util.regex.Pattern;

/** This class is generated by {@link org.jetbrains.kotlin.generators.tests.TestsPackage}. DO NOT MODIFY MANUALLY */
@SuppressWarnings("all")
@TestMetadata("js/js.translator/testData/rtti/cases")
@TestDataPath("$PROJECT_ROOT")
@RunWith(JUnit3RunnerWithInners.class)
public class RttiTestGenerated extends AbstractRttiTest {
    public void testAllFilesPresentInCases() throws Exception {
        KotlinTestUtils.assertAllTestsPresentByMetadata(this.getClass(), new File("js/js.translator/testData/rtti/cases"), Pattern.compile("^(.+)\\.kt$"), true);
    }

    @TestMetadata("collectionClassesIsCheck.kt")
    public void testCollectionClassesIsCheck() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("js/js.translator/testData/rtti/cases/collectionClassesIsCheck.kt");
        doTest(fileName);
    }

    @TestMetadata("isComparable.kt")
    public void testIsComparable() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("js/js.translator/testData/rtti/cases/isComparable.kt");
        doTest(fileName);
    }

    @TestMetadata("isJsPrimitiveType.kt")
    public void testIsJsPrimitiveType() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("js/js.translator/testData/rtti/cases/isJsPrimitiveType.kt");
        doTest(fileName);
    }

    @TestMetadata("isObject.kt")
    public void testIsObject() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("js/js.translator/testData/rtti/cases/isObject.kt");
        doTest(fileName);
    }

    @TestMetadata("isSameClass.kt")
    public void testIsSameClass() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("js/js.translator/testData/rtti/cases/isSameClass.kt");
        doTest(fileName);
    }

    @TestMetadata("notIsOtherClass.kt")
    public void testNotIsOtherClass() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("js/js.translator/testData/rtti/cases/notIsOtherClass.kt");
        doTest(fileName);
    }

    @TestMetadata("objectExpression.kt")
    public void testObjectExpression() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("js/js.translator/testData/rtti/cases/objectExpression.kt");
        doTest(fileName);
    }

    @TestMetadata("onNativeObject.kt")
    public void testOnNativeObject() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("js/js.translator/testData/rtti/cases/onNativeObject.kt");
        doTest(fileName);
    }

    @TestMetadata("rttiForClass.kt")
    public void testRttiForClass() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("js/js.translator/testData/rtti/cases/rttiForClass.kt");
        doTest(fileName);
    }

    @TestMetadata("rttiForTrait.kt")
    public void testRttiForTrait() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("js/js.translator/testData/rtti/cases/rttiForTrait.kt");
        doTest(fileName);
    }

    @TestMetadata("rttiForTrait2.kt")
    public void testRttiForTrait2() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("js/js.translator/testData/rtti/cases/rttiForTrait2.kt");
        doTest(fileName);
    }

    @TestMetadata("sideEffectMethod.kt")
    public void testSideEffectMethod() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("js/js.translator/testData/rtti/cases/sideEffectMethod.kt");
        doTest(fileName);
    }

    @TestMetadata("sideEffectProperty.kt")
    public void testSideEffectProperty() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("js/js.translator/testData/rtti/cases/sideEffectProperty.kt");
        doTest(fileName);
    }

    @TestMetadata("stdlibEmptyListClass.kt")
    public void testStdlibEmptyListClass() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("js/js.translator/testData/rtti/cases/stdlibEmptyListClass.kt");
        doTest(fileName);
    }
}
