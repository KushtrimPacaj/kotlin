/*
 * Copyright 2010-2019 JetBrains s.r.o. Use of this source code is governed by the Apache 2.0 license
 * that can be found in the license/LICENSE.txt file.
 */

package org.jetbrains.kotlin.android.quickfix;

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
@TestMetadata("idea/testData/android/lintQuickfix")
@TestDataPath("$PROJECT_ROOT")
@RunWith(JUnit3RunnerWithInners.class)
public class AndroidLintQuickfixTestGenerated extends AbstractAndroidLintQuickfixTest {
    private void runTest(String testDataFilePath) throws Exception {
        KotlinTestUtils.runTest(this::doTest, TargetBackend.ANY, testDataFilePath);
    }

    public void testAllFilesPresentInLintQuickfix() throws Exception {
        KotlinTestUtils.assertAllTestsPresentByMetadata(this.getClass(), new File("idea/testData/android/lintQuickfix"), Pattern.compile("^([\\w\\-_]+)\\.kt$"), TargetBackend.ANY, true);
    }

    @TestMetadata("idea/testData/android/lintQuickfix/findViewById")
    @TestDataPath("$PROJECT_ROOT")
    @RunWith(JUnit3RunnerWithInners.class)
    public static class FindViewById extends AbstractAndroidLintQuickfixTest {
        private void runTest(String testDataFilePath) throws Exception {
            KotlinTestUtils.runTest(this::doTest, TargetBackend.ANY, testDataFilePath);
        }

        public void testAllFilesPresentInFindViewById() throws Exception {
            KotlinTestUtils.assertAllTestsPresentByMetadata(this.getClass(), new File("idea/testData/android/lintQuickfix/findViewById"), Pattern.compile("^([\\w\\-_]+)\\.kt$"), TargetBackend.ANY, true);
        }

        @TestMetadata("nullableType.kt")
        public void testNullableType() throws Exception {
            runTest("idea/testData/android/lintQuickfix/findViewById/nullableType.kt");
        }

        @TestMetadata("simple.kt")
        public void testSimple() throws Exception {
            runTest("idea/testData/android/lintQuickfix/findViewById/simple.kt");
        }
    }

    @TestMetadata("idea/testData/android/lintQuickfix/parcelable")
    @TestDataPath("$PROJECT_ROOT")
    @RunWith(JUnit3RunnerWithInners.class)
    public static class Parcelable extends AbstractAndroidLintQuickfixTest {
        private void runTest(String testDataFilePath) throws Exception {
            KotlinTestUtils.runTest(this::doTest, TargetBackend.ANY, testDataFilePath);
        }

        public void testAllFilesPresentInParcelable() throws Exception {
            KotlinTestUtils.assertAllTestsPresentByMetadata(this.getClass(), new File("idea/testData/android/lintQuickfix/parcelable"), Pattern.compile("^([\\w\\-_]+)\\.kt$"), TargetBackend.ANY, true);
        }

        @TestMetadata("missingCreator.kt")
        public void testMissingCreator() throws Exception {
            runTest("idea/testData/android/lintQuickfix/parcelable/missingCreator.kt");
        }

        @TestMetadata("noImplementation.kt")
        public void testNoImplementation() throws Exception {
            runTest("idea/testData/android/lintQuickfix/parcelable/noImplementation.kt");
        }
    }

    @TestMetadata("idea/testData/android/lintQuickfix/requiresApi")
    @TestDataPath("$PROJECT_ROOT")
    @RunWith(JUnit3RunnerWithInners.class)
    public static class RequiresApi extends AbstractAndroidLintQuickfixTest {
        private void runTest(String testDataFilePath) throws Exception {
            KotlinTestUtils.runTest(this::doTest, TargetBackend.ANY, testDataFilePath);
        }

        public void testAllFilesPresentInRequiresApi() throws Exception {
            KotlinTestUtils.assertAllTestsPresentByMetadata(this.getClass(), new File("idea/testData/android/lintQuickfix/requiresApi"), Pattern.compile("^([\\w\\-_]+)\\.kt$"), TargetBackend.ANY, true);
        }

        @TestMetadata("companion.kt")
        public void testCompanion() throws Exception {
            runTest("idea/testData/android/lintQuickfix/requiresApi/companion.kt");
        }

        @TestMetadata("defaultParameter.kt")
        public void testDefaultParameter() throws Exception {
            runTest("idea/testData/android/lintQuickfix/requiresApi/defaultParameter.kt");
        }

        @TestMetadata("extend.kt")
        public void testExtend() throws Exception {
            runTest("idea/testData/android/lintQuickfix/requiresApi/extend.kt");
        }

        @TestMetadata("functionLiteral.kt")
        public void testFunctionLiteral() throws Exception {
            runTest("idea/testData/android/lintQuickfix/requiresApi/functionLiteral.kt");
        }

        @TestMetadata("inlinedConstant.kt")
        public void testInlinedConstant() throws Exception {
            runTest("idea/testData/android/lintQuickfix/requiresApi/inlinedConstant.kt");
        }

        @TestMetadata("method.kt")
        public void testMethod() throws Exception {
            runTest("idea/testData/android/lintQuickfix/requiresApi/method.kt");
        }

        @TestMetadata("property.kt")
        public void testProperty() throws Exception {
            runTest("idea/testData/android/lintQuickfix/requiresApi/property.kt");
        }

        @TestMetadata("topLevelProperty.kt")
        public void testTopLevelProperty() throws Exception {
            runTest("idea/testData/android/lintQuickfix/requiresApi/topLevelProperty.kt");
        }

        @TestMetadata("when.kt")
        public void testWhen() throws Exception {
            runTest("idea/testData/android/lintQuickfix/requiresApi/when.kt");
        }
    }

    @TestMetadata("idea/testData/android/lintQuickfix/suppressLint")
    @TestDataPath("$PROJECT_ROOT")
    @RunWith(JUnit3RunnerWithInners.class)
    public static class SuppressLint extends AbstractAndroidLintQuickfixTest {
        private void runTest(String testDataFilePath) throws Exception {
            KotlinTestUtils.runTest(this::doTest, TargetBackend.ANY, testDataFilePath);
        }

        @TestMetadata("activityMethod.kt")
        public void testActivityMethod() throws Exception {
            runTest("idea/testData/android/lintQuickfix/suppressLint/activityMethod.kt");
        }

        @TestMetadata("addToExistingAnnotation.kt")
        public void testAddToExistingAnnotation() throws Exception {
            runTest("idea/testData/android/lintQuickfix/suppressLint/addToExistingAnnotation.kt");
        }

        public void testAllFilesPresentInSuppressLint() throws Exception {
            KotlinTestUtils.assertAllTestsPresentByMetadata(this.getClass(), new File("idea/testData/android/lintQuickfix/suppressLint"), Pattern.compile("^([\\w\\-_]+)\\.kt$"), TargetBackend.ANY, true);
        }

        @TestMetadata("constructorParameter.kt")
        public void testConstructorParameter() throws Exception {
            runTest("idea/testData/android/lintQuickfix/suppressLint/constructorParameter.kt");
        }

        @TestMetadata("destructuringDeclaration.kt")
        public void testDestructuringDeclaration() throws Exception {
            runTest("idea/testData/android/lintQuickfix/suppressLint/destructuringDeclaration.kt");
        }

        @TestMetadata("lambdaArgument.kt")
        public void testLambdaArgument() throws Exception {
            runTest("idea/testData/android/lintQuickfix/suppressLint/lambdaArgument.kt");
        }

        @TestMetadata("lambdaArgumentProperty.kt")
        public void testLambdaArgumentProperty() throws Exception {
            runTest("idea/testData/android/lintQuickfix/suppressLint/lambdaArgumentProperty.kt");
        }

        @TestMetadata("methodParameter.kt")
        public void testMethodParameter() throws Exception {
            runTest("idea/testData/android/lintQuickfix/suppressLint/methodParameter.kt");
        }

        @TestMetadata("propertyWithLambda.kt")
        public void testPropertyWithLambda() throws Exception {
            runTest("idea/testData/android/lintQuickfix/suppressLint/propertyWithLambda.kt");
        }

        @TestMetadata("simpleProperty.kt")
        public void testSimpleProperty() throws Exception {
            runTest("idea/testData/android/lintQuickfix/suppressLint/simpleProperty.kt");
        }
    }

    @TestMetadata("idea/testData/android/lintQuickfix/targetApi")
    @TestDataPath("$PROJECT_ROOT")
    @RunWith(JUnit3RunnerWithInners.class)
    public static class TargetApi extends AbstractAndroidLintQuickfixTest {
        private void runTest(String testDataFilePath) throws Exception {
            KotlinTestUtils.runTest(this::doTest, TargetBackend.ANY, testDataFilePath);
        }

        public void testAllFilesPresentInTargetApi() throws Exception {
            KotlinTestUtils.assertAllTestsPresentByMetadata(this.getClass(), new File("idea/testData/android/lintQuickfix/targetApi"), Pattern.compile("^([\\w\\-_]+)\\.kt$"), TargetBackend.ANY, true);
        }

        @TestMetadata("companion.kt")
        public void testCompanion() throws Exception {
            runTest("idea/testData/android/lintQuickfix/targetApi/companion.kt");
        }

        @TestMetadata("defaultParameter.kt")
        public void testDefaultParameter() throws Exception {
            runTest("idea/testData/android/lintQuickfix/targetApi/defaultParameter.kt");
        }

        @TestMetadata("extend.kt")
        public void testExtend() throws Exception {
            runTest("idea/testData/android/lintQuickfix/targetApi/extend.kt");
        }

        @TestMetadata("functionLiteral.kt")
        public void testFunctionLiteral() throws Exception {
            runTest("idea/testData/android/lintQuickfix/targetApi/functionLiteral.kt");
        }

        @TestMetadata("inlinedConstant.kt")
        public void testInlinedConstant() throws Exception {
            runTest("idea/testData/android/lintQuickfix/targetApi/inlinedConstant.kt");
        }

        @TestMetadata("method.kt")
        public void testMethod() throws Exception {
            runTest("idea/testData/android/lintQuickfix/targetApi/method.kt");
        }

        @TestMetadata("property.kt")
        public void testProperty() throws Exception {
            runTest("idea/testData/android/lintQuickfix/targetApi/property.kt");
        }

        @TestMetadata("topLevelProperty.kt")
        public void testTopLevelProperty() throws Exception {
            runTest("idea/testData/android/lintQuickfix/targetApi/topLevelProperty.kt");
        }

        @TestMetadata("when.kt")
        public void testWhen() throws Exception {
            runTest("idea/testData/android/lintQuickfix/targetApi/when.kt");
        }
    }

    @TestMetadata("idea/testData/android/lintQuickfix/targetVersionCheck")
    @TestDataPath("$PROJECT_ROOT")
    @RunWith(JUnit3RunnerWithInners.class)
    public static class TargetVersionCheck extends AbstractAndroidLintQuickfixTest {
        private void runTest(String testDataFilePath) throws Exception {
            KotlinTestUtils.runTest(this::doTest, TargetBackend.ANY, testDataFilePath);
        }

        public void testAllFilesPresentInTargetVersionCheck() throws Exception {
            KotlinTestUtils.assertAllTestsPresentByMetadata(this.getClass(), new File("idea/testData/android/lintQuickfix/targetVersionCheck"), Pattern.compile("^([\\w\\-_]+)\\.kt$"), TargetBackend.ANY, true);
        }

        @TestMetadata("annotation.kt")
        public void testAnnotation() throws Exception {
            runTest("idea/testData/android/lintQuickfix/targetVersionCheck/annotation.kt");
        }

        @TestMetadata("defaultParameter.kt")
        public void testDefaultParameter() throws Exception {
            runTest("idea/testData/android/lintQuickfix/targetVersionCheck/defaultParameter.kt");
        }

        @TestMetadata("destructuringDeclaration.kt")
        public void testDestructuringDeclaration() throws Exception {
            runTest("idea/testData/android/lintQuickfix/targetVersionCheck/destructuringDeclaration.kt");
        }

        @TestMetadata("expressionBody.kt")
        public void testExpressionBody() throws Exception {
            runTest("idea/testData/android/lintQuickfix/targetVersionCheck/expressionBody.kt");
        }

        @TestMetadata("functionLiteral.kt")
        public void testFunctionLiteral() throws Exception {
            runTest("idea/testData/android/lintQuickfix/targetVersionCheck/functionLiteral.kt");
        }

        @TestMetadata("getterWIthExpressionBody.kt")
        public void testGetterWIthExpressionBody() throws Exception {
            runTest("idea/testData/android/lintQuickfix/targetVersionCheck/getterWIthExpressionBody.kt");
        }

        @TestMetadata("if.kt")
        public void testIf() throws Exception {
            runTest("idea/testData/android/lintQuickfix/targetVersionCheck/if.kt");
        }

        @TestMetadata("ifWithBlock.kt")
        public void testIfWithBlock() throws Exception {
            runTest("idea/testData/android/lintQuickfix/targetVersionCheck/ifWithBlock.kt");
        }

        @TestMetadata("inlinedConstant.kt")
        public void testInlinedConstant() throws Exception {
            runTest("idea/testData/android/lintQuickfix/targetVersionCheck/inlinedConstant.kt");
        }

        @TestMetadata("method.kt")
        public void testMethod() throws Exception {
            runTest("idea/testData/android/lintQuickfix/targetVersionCheck/method.kt");
        }

        @TestMetadata("when.kt")
        public void testWhen() throws Exception {
            runTest("idea/testData/android/lintQuickfix/targetVersionCheck/when.kt");
        }
    }
}
