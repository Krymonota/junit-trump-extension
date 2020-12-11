package id.niklas.junit_trump_extension;

import org.junit.jupiter.api.extension.ConditionEvaluationResult;
import org.junit.jupiter.api.extension.ExecutionCondition;
import org.junit.jupiter.api.extension.ExtensionContext;

/**
 * {@link ExecutionCondition} that always returns disabled,
 * because if we stop testing right now, we'd have very few cases.
 */
public class JUnitTrumpExtension implements ExecutionCondition {

    @Override
    public ConditionEvaluationResult evaluateExecutionCondition(ExtensionContext extensionContext) {
        return ConditionEvaluationResult.disabled("If we stop testing right now, we'd have very few cases.");
    }

}
