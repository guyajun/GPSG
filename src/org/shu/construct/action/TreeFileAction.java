package org.shu.construct.action;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.shu.construct.service.MenuService;
import org.tool.CommonParam;

import com.opensymphony.xwork2.ActionContext;

import common.base.action.BaseAction;
import common.datastructure.Tree;

public class TreeFileAction extends BaseAction {
	private static final long serialVersionUID = 1L;
	private MenuService menuService;
	private List<Tree> modulesTree;	
	
	public void setMenuService(MenuService menuService) {
		this.menuService = menuService;
	}
	public List<Tree> getModulesTree() {
		return modulesTree;
	}
	public void setModulesTree(List<Tree> modulesTree) {
		this.modulesTree = modulesTree;
	}
	public String generateTree() {
		String filePath=request.getParameter("localPath");
		File file = new File(filePath);
		File[] files = file.listFiles();
		ArrayList<File> fileList = new ArrayList<File>();
		ArrayList<Tree> children=new ArrayList<Tree>();		
		for (int i = 0; i < files.length; i++) {
			Tree tree=new Tree();
			tree.setText(files[i].getName());
			children.add(tree);
			fileList.add(files[i]);
		}
		Tree rootNode = new Tree();
		rootNode.setId(0);
		rootNode.setText(file.getName());
		rootNode.setState("open");
		rootNode.setChildren(children);
		ArrayList<Tree> treeList = new ArrayList<Tree>();
		treeList.add(rootNode);
		menuService.treeGenerator(fileList, rootNode);
		modulesTree=treeList;
		return SUCCESS;
	}

	
}