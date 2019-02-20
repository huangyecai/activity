package com.hyc.activity.modules.flow.controller;

import org.activiti.engine.FormService;
import org.activiti.engine.HistoryService;
import org.activiti.engine.IdentityService;
import org.activiti.engine.RepositoryService;
import org.activiti.engine.RuntimeService;
import org.activiti.engine.TaskService;
import org.activiti.engine.repository.DeploymentBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class FlowController {
	
	public static final String COMMON = "flow";
	public static final String LIST = COMMON + "/list";
	public static final String DEPLOY = COMMON + "/deploy";
	@Autowired
	private RepositoryService repositoryService;
	@Autowired
	private RuntimeService runtimeService;
	@Autowired
	private TaskService taskService;
	@Autowired
	private HistoryService historyService;
	@Autowired
	private FormService formService;
	@Autowired
	private IdentityService identityService;

	@RequestMapping(LIST)
	public void list() {
		DeploymentBuilder a = repositoryService.createDeployment();
	}
}
