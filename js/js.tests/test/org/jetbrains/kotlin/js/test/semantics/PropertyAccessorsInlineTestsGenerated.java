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
@TestMetadata("compiler/testData/codegen/boxInline/property")
@TestDataPath("$PROJECT_ROOT")
@RunWith(JUnit3RunnerWithInners.class)
public class PropertyAccessorsInlineTestsGenerated extends AbstractPropertyAccessorsInlineTests {
    private void runTest(String testDataFilePath) throws Exception {
        KotlinTestUtils.runTest0(this::doTest, TargetBackend.JS, testDataFilePath);
    }

    public void testAllFilesPresentInProperty() throws Exception {
        KotlinTestUtils.assertAllTestsPresentByMetadata(this.getClass(), new File("compiler/testData/codegen/boxInline/property"), Pattern.compile("^(.+)\\.kt$"), TargetBackend.JS, true);
    }

    @TestMetadata("augAssignmentAndInc.kt")
    public void testAugAssignmentAndInc() throws Exception {
        runTest("compiler/testData/codegen/boxInline/property/augAssignmentAndInc.kt");
    }

    @TestMetadata("augAssignmentAndIncInClass.kt")
    public void testAugAssignmentAndIncInClass() throws Exception {
        runTest("compiler/testData/codegen/boxInline/property/augAssignmentAndIncInClass.kt");
    }

    @TestMetadata("augAssignmentAndIncInClassViaConvention.kt")
    public void testAugAssignmentAndIncInClassViaConvention() throws Exception {
        runTest("compiler/testData/codegen/boxInline/property/augAssignmentAndIncInClassViaConvention.kt");
    }

    @TestMetadata("augAssignmentAndIncOnExtension.kt")
    public void testAugAssignmentAndIncOnExtension() throws Exception {
        runTest("compiler/testData/codegen/boxInline/property/augAssignmentAndIncOnExtension.kt");
    }

    @TestMetadata("augAssignmentAndIncOnExtensionInClass.kt")
    public void testAugAssignmentAndIncOnExtensionInClass() throws Exception {
        runTest("compiler/testData/codegen/boxInline/property/augAssignmentAndIncOnExtensionInClass.kt");
    }

    @TestMetadata("augAssignmentAndIncViaConvention.kt")
    public void testAugAssignmentAndIncViaConvention() throws Exception {
        runTest("compiler/testData/codegen/boxInline/property/augAssignmentAndIncViaConvention.kt");
    }

    @TestMetadata("kt22649.kt")
    public void testKt22649() throws Exception {
        runTest("compiler/testData/codegen/boxInline/property/kt22649.kt");
    }

    @TestMetadata("property.kt")
    public void testProperty() throws Exception {
        runTest("compiler/testData/codegen/boxInline/property/property.kt");
    }

    @TestMetadata("reifiedVal.kt")
    public void testReifiedVal() throws Exception {
        runTest("compiler/testData/codegen/boxInline/property/reifiedVal.kt");
    }

    @TestMetadata("reifiedVar.kt")
    public void testReifiedVar() throws Exception {
        runTest("compiler/testData/codegen/boxInline/property/reifiedVar.kt");
    }

    @TestMetadata("simple.kt")
    public void testSimple() throws Exception {
        runTest("compiler/testData/codegen/boxInline/property/simple.kt");
    }

    @TestMetadata("simpleExtension.kt")
    public void testSimpleExtension() throws Exception {
        runTest("compiler/testData/codegen/boxInline/property/simpleExtension.kt");
    }
}
