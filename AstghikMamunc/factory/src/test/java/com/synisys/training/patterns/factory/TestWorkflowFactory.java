package com.synisys.training.patterns.factory;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author astghik.mamunc on 11/13/2017.
 */
public class TestWorkflowFactory {

	@Test
	public void testActivityWorkflowFactory(){
		Workflow workflow = WorkflowFactory.createWorkflow(WorkflowCategory.ACTIVITY);
		Assert.assertEquals("Workflow must be ActivityWorkflow", ActivityWorkflow.class, workflow.getClass());
	}

	@Test
	public void testActivityIndicatorWorkflowFactory(){
		Workflow workflow = WorkflowFactory.createWorkflow(WorkflowCategory.INDICATOR);
		Assert.assertEquals("Workflow must be ActivityIndicatorWorkflow", ActivityIndicatorWorkflow.class, workflow.getClass());
	}

	@Test
	public void testActivityDQAReportWorkflowFactory(){
		Workflow workflow = WorkflowFactory.createWorkflow(WorkflowCategory.DQA_REPORT);
		Assert.assertEquals("Workflow must be ActivityDQAReportWorkflow", ActivityDQAReportWorkflow.class, workflow.getClass());
	}
}
