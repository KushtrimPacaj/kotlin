/*
 * Copyright 2010-2019 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the license/LICENSE.txt file.
 */

package org.jetbrains.kotlin.idea.debugger;

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
@TestMetadata("idea/testData/debugger/breakpointApplicability")
@TestDataPath("$PROJECT_ROOT")
@RunWith(JUnit3RunnerWithInners.class)
public class BreakpointApplicabilityTestGenerated extends AbstractBreakpointApplicabilityTest {
    private void runTest(String testDataFilePath) throws Exception {
        KotlinTestUtils.runTest(this::doTest, TargetBackend.ANY, testDataFilePath);
    }

    public void testAllFilesPresentInBreakpointApplicability() throws Exception {
        KotlinTestUtils.assertAllTestsPresentByMetadata(this.getClass(), new File("idea/testData/debugger/breakpointApplicability"), Pattern.compile("^(.+)\\.kt$"), TargetBackend.ANY, true);
    }

    @TestMetadata("constructors.kt")
    public void testConstructors() throws Exception {
        runTest("idea/testData/debugger/breakpointApplicability/constructors.kt");
    }

    @TestMetadata("functions.kt")
    public void testFunctions() throws Exception {
        runTest("idea/testData/debugger/breakpointApplicability/functions.kt");
    }

    @TestMetadata("inlineOnly.kt")
    public void testInlineOnly() throws Exception {
        runTest("idea/testData/debugger/breakpointApplicability/inlineOnly.kt");
    }

    @TestMetadata("locals.kt")
    public void testLocals() throws Exception {
        runTest("idea/testData/debugger/breakpointApplicability/locals.kt");
    }

    @TestMetadata("properties.kt")
    public void testProperties() throws Exception {
        runTest("idea/testData/debugger/breakpointApplicability/properties.kt");
    }

    @TestMetadata("simple.kt")
    public void testSimple() throws Exception {
        runTest("idea/testData/debugger/breakpointApplicability/simple.kt");
    }
}
