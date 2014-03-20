package org.shu.construct.service;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import org.shu.construct.dao.MenuDao;
import org.shu.model.FunctionInfo;
import common.datastructure.Tree;

public class MenuService {

	private MenuDao menuDao;

	public void setMenuDao(MenuDao menuDao) {
		this.menuDao = menuDao;
	}

	public ArrayList<FunctionInfo> getAll() {
		return menuDao.getAll();
	}

	public ArrayList<FunctionInfo> getById(int functionId) {
		return menuDao.getById(functionId);
	}

	public void treeGenerator(List<File> children, Tree parent) {
		ArrayList<Tree> treeList = new ArrayList<Tree>();
		parent.setChildren(treeList);
		if (children != null && children.size() > 0) {
			for (int i = 0; i < children.size(); i++) {
				File file = children.get(i);
				if (file.isDirectory()) {
					File[] files = file.listFiles();
					ArrayList<File> fileList = new ArrayList<File>();
					for (int j = 0; j < files.length; j++) {
						fileList.add(files[j]);
					}
					Tree child = new Tree();
					child.setText(file.getName());
					treeList.add(child);
					treeGenerator(fileList, child);
				} else {
					Tree child = new Tree();
					child.setText(file.getName());
					treeList.add(child);
				}
			}
		}

	}
}
