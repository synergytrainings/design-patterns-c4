package com.synisys.training.patterns.factory;

/**
 * @author astghik.mamunc on 11/13/2017.
 */
public class WorkflowFactory {

	public static Workflow createWorkflow(WorkflowCategory category){
		switch (category){
			case ACTIVITY:
				return new ActivityWorkflow();
			case INDICATOR:
				return new ActivityIndicatorWorkflow();
			case DQA_REPORT:
				return new ActivityDQAReportWorkflow();
			default:
				throw new IllegalArgumentException(String.format("Unsupported category %s ", category));
		}
	}

}
