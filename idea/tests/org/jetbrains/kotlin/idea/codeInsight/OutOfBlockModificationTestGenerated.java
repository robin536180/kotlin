/*
 * Copyright 2010-2018 JetBrains s.r.o. Use of this source code is governed by the Apache 2.0 license
 * that can be found in the license/LICENSE.txt file.
 */

package org.jetbrains.kotlin.idea.codeInsight;

import com.intellij.testFramework.TestDataPath;
import org.jetbrains.kotlin.test.JUnit3RunnerWithInners;
import org.jetbrains.kotlin.test.KotlinTestUtils;
import org.jetbrains.kotlin.test.TargetBackend;
import org.jetbrains.kotlin.test.TestMetadata;
import org.junit.runner.RunWith;

import java.io.File;
import java.util.regex.Pattern;

/** This class is generated by {@link org.jetbrains.kotlin.generators.tests.TestsPackage}. DO NOT MODIFY MANUALLY */
@SuppressWarnings("all")
@TestMetadata("idea/testData/codeInsight/outOfBlock")
@TestDataPath("$PROJECT_ROOT")
@RunWith(JUnit3RunnerWithInners.class)
public class OutOfBlockModificationTestGenerated extends AbstractOutOfBlockModificationTest {
    private void runTest(String testDataFilePath) throws Exception {
        KotlinTestUtils.runTest(this::doTest, TargetBackend.ANY, testDataFilePath);
    }

    public void testAllFilesPresentInOutOfBlock() throws Exception {
        KotlinTestUtils.assertAllTestsPresentByMetadata(this.getClass(), new File("idea/testData/codeInsight/outOfBlock"), Pattern.compile("^(.+)\\.kt$"), TargetBackend.ANY, true);
    }

    @TestMetadata("Class_Class_FunNoType_Block.kt")
    public void testClass_Class_FunNoType_Block() throws Exception {
        runTest("idea/testData/codeInsight/outOfBlock/Class_Class_FunNoType_Block.kt");
    }

    @TestMetadata("Class_Class_FunNoType_Block_Expression.kt")
    public void testClass_Class_FunNoType_Block_Expression() throws Exception {
        runTest("idea/testData/codeInsight/outOfBlock/Class_Class_FunNoType_Block_Expression.kt");
    }

    @TestMetadata("FunInFun.kt")
    public void testFunInFun() throws Exception {
        runTest("idea/testData/codeInsight/outOfBlock/FunInFun.kt");
    }

    @TestMetadata("FunInInitBlock.kt")
    public void testFunInInitBlock() throws Exception {
        runTest("idea/testData/codeInsight/outOfBlock/FunInInitBlock.kt");
    }

    @TestMetadata("FunNoBody.kt")
    public void testFunNoBody() throws Exception {
        runTest("idea/testData/codeInsight/outOfBlock/FunNoBody.kt");
    }

    @TestMetadata("FunNoType_Block.kt")
    public void testFunNoType_Block() throws Exception {
        runTest("idea/testData/codeInsight/outOfBlock/FunNoType_Block.kt");
    }

    @TestMetadata("FunNoType_Block_Class.kt")
    public void testFunNoType_Block_Class() throws Exception {
        runTest("idea/testData/codeInsight/outOfBlock/FunNoType_Block_Class.kt");
    }

    @TestMetadata("FunWithType_Initializer.kt")
    public void testFunWithType_Initializer() throws Exception {
        runTest("idea/testData/codeInsight/outOfBlock/FunWithType_Initializer.kt");
    }

    @TestMetadata("FunWithType_Initializer_Expression.kt")
    public void testFunWithType_Initializer_Expression() throws Exception {
        runTest("idea/testData/codeInsight/outOfBlock/FunWithType_Initializer_Expression.kt");
    }

    @TestMetadata("InAntonymsObjectDeclaration.kt")
    public void testInAntonymsObjectDeclaration() throws Exception {
        runTest("idea/testData/codeInsight/outOfBlock/InAntonymsObjectDeclaration.kt");
    }

    @TestMetadata("InClass.kt")
    public void testInClass() throws Exception {
        runTest("idea/testData/codeInsight/outOfBlock/InClass.kt");
    }

    @TestMetadata("InClassInClass.kt")
    public void testInClassInClass() throws Exception {
        runTest("idea/testData/codeInsight/outOfBlock/InClassInClass.kt");
    }

    @TestMetadata("InClassPropertyAccessor.kt")
    public void testInClassPropertyAccessor() throws Exception {
        runTest("idea/testData/codeInsight/outOfBlock/InClassPropertyAccessor.kt");
    }

    @TestMetadata("InFunInFunWithBody.kt")
    public void testInFunInFunWithBody() throws Exception {
        runTest("idea/testData/codeInsight/outOfBlock/InFunInFunWithBody.kt");
    }

    @TestMetadata("InFunInFunctionInitializerInFun.kt")
    public void testInFunInFunctionInitializerInFun() throws Exception {
        runTest("idea/testData/codeInsight/outOfBlock/InFunInFunctionInitializerInFun.kt");
    }

    @TestMetadata("InFunInMultiDeclaration.kt")
    public void testInFunInMultiDeclaration() throws Exception {
        runTest("idea/testData/codeInsight/outOfBlock/InFunInMultiDeclaration.kt");
    }

    @TestMetadata("InFunInProperty.kt")
    public void testInFunInProperty() throws Exception {
        runTest("idea/testData/codeInsight/outOfBlock/InFunInProperty.kt");
    }

    @TestMetadata("InFunInPropertyInObjectLiteral.kt")
    public void testInFunInPropertyInObjectLiteral() throws Exception {
        runTest("idea/testData/codeInsight/outOfBlock/InFunInPropertyInObjectLiteral.kt");
    }

    @TestMetadata("InFunObjectLiteral.kt")
    public void testInFunObjectLiteral() throws Exception {
        runTest("idea/testData/codeInsight/outOfBlock/InFunObjectLiteral.kt");
    }

    @TestMetadata("InFunWithInference.kt")
    public void testInFunWithInference() throws Exception {
        runTest("idea/testData/codeInsight/outOfBlock/InFunWithInference.kt");
    }

    @TestMetadata("InFunctionLiteral.kt")
    public void testInFunctionLiteral() throws Exception {
        runTest("idea/testData/codeInsight/outOfBlock/InFunctionLiteral.kt");
    }

    @TestMetadata("InGlobalPropertyWithGetter.kt")
    public void testInGlobalPropertyWithGetter() throws Exception {
        runTest("idea/testData/codeInsight/outOfBlock/InGlobalPropertyWithGetter.kt");
    }

    @TestMetadata("InMethod.kt")
    public void testInMethod() throws Exception {
        runTest("idea/testData/codeInsight/outOfBlock/InMethod.kt");
    }

    @TestMetadata("InPropertyAccessorWithInference.kt")
    public void testInPropertyAccessorWithInference() throws Exception {
        runTest("idea/testData/codeInsight/outOfBlock/InPropertyAccessorWithInference.kt");
    }

    @TestMetadata("InPropertyAccessorWithInferenceInClass.kt")
    public void testInPropertyAccessorWithInferenceInClass() throws Exception {
        runTest("idea/testData/codeInsight/outOfBlock/InPropertyAccessorWithInferenceInClass.kt");
    }

    @TestMetadata("InPropertyWithFunctionLiteral.kt")
    public void testInPropertyWithFunctionLiteral() throws Exception {
        runTest("idea/testData/codeInsight/outOfBlock/InPropertyWithFunctionLiteral.kt");
    }

    @TestMetadata("InPropertyWithInference.kt")
    public void testInPropertyWithInference() throws Exception {
        runTest("idea/testData/codeInsight/outOfBlock/InPropertyWithInference.kt");
    }

    @TestMetadata("InSuperTypeCallCallInLambdaInCall.kt")
    public void testInSuperTypeCallCallInLambdaInCall() throws Exception {
        runTest("idea/testData/codeInsight/outOfBlock/InSuperTypeCallCallInLambdaInCall.kt");
    }

    @TestMetadata("InSuperTypeCallInLambaInBody.kt")
    public void testInSuperTypeCallInLambaInBody() throws Exception {
        runTest("idea/testData/codeInsight/outOfBlock/InSuperTypeCallInLambaInBody.kt");
    }

    @TestMetadata("InSuperTypeCallInLambdaParameters.kt")
    public void testInSuperTypeCallInLambdaParameters() throws Exception {
        runTest("idea/testData/codeInsight/outOfBlock/InSuperTypeCallInLambdaParameters.kt");
    }

    @TestMetadata("InitBlock.kt")
    public void testInitBlock() throws Exception {
        runTest("idea/testData/codeInsight/outOfBlock/InitBlock.kt");
    }

    @TestMetadata("Object_FunNoType_Block.kt")
    public void testObject_FunNoType_Block() throws Exception {
        runTest("idea/testData/codeInsight/outOfBlock/Object_FunNoType_Block.kt");
    }

    @TestMetadata("Object_FunNoType_Block_Expression.kt")
    public void testObject_FunNoType_Block_Expression() throws Exception {
        runTest("idea/testData/codeInsight/outOfBlock/Object_FunNoType_Block_Expression.kt");
    }

    @TestMetadata("PropNotNullType_Initializer_ObjectLiteral_Fun.kt")
    public void testPropNotNullType_Initializer_ObjectLiteral_Fun() throws Exception {
        runTest("idea/testData/codeInsight/outOfBlock/PropNotNullType_Initializer_ObjectLiteral_Fun.kt");
    }

    @TestMetadata("PropNullType_Initializer_If_Fun.kt")
    public void testPropNullType_Initializer_If_Fun() throws Exception {
        runTest("idea/testData/codeInsight/outOfBlock/PropNullType_Initializer_If_Fun.kt");
    }

    @TestMetadata("PropNullType_Initializer_ObjectLiteral_Fun.kt")
    public void testPropNullType_Initializer_ObjectLiteral_Fun() throws Exception {
        runTest("idea/testData/codeInsight/outOfBlock/PropNullType_Initializer_ObjectLiteral_Fun.kt");
    }

    @TestMetadata("PropertyNoType_Initializer_String.kt")
    public void testPropertyNoType_Initializer_String() throws Exception {
        runTest("idea/testData/codeInsight/outOfBlock/PropertyNoType_Initializer_String.kt");
    }

    @TestMetadata("PropertyWithType_Initializer_String.kt")
    public void testPropertyWithType_Initializer_String() throws Exception {
        runTest("idea/testData/codeInsight/outOfBlock/PropertyWithType_Initializer_String.kt");
    }

    @TestMetadata("StringInSuperConstroctorCall.kt")
    public void testStringInSuperConstroctorCall() throws Exception {
        runTest("idea/testData/codeInsight/outOfBlock/StringInSuperConstroctorCall.kt");
    }

    @TestMetadata("WholeFileChanged.kt")
    public void testWholeFileChanged() throws Exception {
        runTest("idea/testData/codeInsight/outOfBlock/WholeFileChanged.kt");
    }
}
