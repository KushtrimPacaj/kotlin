/*
 * Copyright 2010-2019 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the license/LICENSE.txt file.
 */

package org.jetbrains.kotlin.js.test.semantics;

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
@TestMetadata("compiler/testData/codegen/boxInline/enum")
@TestDataPath("$PROJECT_ROOT")
@RunWith(JUnit3RunnerWithInners.class)
public class EnumValuesInlineTestsGenerated extends AbstractEnumValuesInlineTests {
    private void runTest(String testDataFilePath) throws Exception {
        KotlinTestUtils.runTest0(this::doTest, TargetBackend.JS, testDataFilePath);
    }

    public void testAllFilesPresentInEnum() throws Exception {
        KotlinTestUtils.assertAllTestsPresentByMetadata(this.getClass(), new File("compiler/testData/codegen/boxInline/enum"), Pattern.compile("^(.+)\\.kt$"), TargetBackend.JS, true);
    }

    @TestMetadata("kt10569.kt")
    public void testKt10569() throws Exception {
        runTest("compiler/testData/codegen/boxInline/enum/kt10569.kt");
    }

    @TestMetadata("kt18254.kt")
    public void testKt18254() throws Exception {
        runTest("compiler/testData/codegen/boxInline/enum/kt18254.kt");
    }

    @TestMetadata("valueOf.kt")
    public void testValueOf() throws Exception {
        runTest("compiler/testData/codegen/boxInline/enum/valueOf.kt");
    }

    @TestMetadata("valueOfCapturedType.kt")
    public void testValueOfCapturedType() throws Exception {
        runTest("compiler/testData/codegen/boxInline/enum/valueOfCapturedType.kt");
    }

    @TestMetadata("valueOfChain.kt")
    public void testValueOfChain() throws Exception {
        runTest("compiler/testData/codegen/boxInline/enum/valueOfChain.kt");
    }

    @TestMetadata("valueOfChainCapturedType.kt")
    public void testValueOfChainCapturedType() throws Exception {
        runTest("compiler/testData/codegen/boxInline/enum/valueOfChainCapturedType.kt");
    }

    @TestMetadata("valueOfNonReified.kt")
    public void testValueOfNonReified() throws Exception {
        runTest("compiler/testData/codegen/boxInline/enum/valueOfNonReified.kt");
    }

    @TestMetadata("values.kt")
    public void testValues() throws Exception {
        runTest("compiler/testData/codegen/boxInline/enum/values.kt");
    }

    @TestMetadata("valuesAsArray.kt")
    public void testValuesAsArray() throws Exception {
        runTest("compiler/testData/codegen/boxInline/enum/valuesAsArray.kt");
    }

    @TestMetadata("valuesCapturedType.kt")
    public void testValuesCapturedType() throws Exception {
        runTest("compiler/testData/codegen/boxInline/enum/valuesCapturedType.kt");
    }

    @TestMetadata("valuesChain.kt")
    public void testValuesChain() throws Exception {
        runTest("compiler/testData/codegen/boxInline/enum/valuesChain.kt");
    }

    @TestMetadata("valuesChainCapturedType.kt")
    public void testValuesChainCapturedType() throws Exception {
        runTest("compiler/testData/codegen/boxInline/enum/valuesChainCapturedType.kt");
    }

    @TestMetadata("valuesNonReified.kt")
    public void testValuesNonReified() throws Exception {
        runTest("compiler/testData/codegen/boxInline/enum/valuesNonReified.kt");
    }
}
