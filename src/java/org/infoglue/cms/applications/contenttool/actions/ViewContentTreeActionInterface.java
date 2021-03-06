/* ===============================================================================
 *
 * Part of the InfoGlue Content Management Platform (www.infoglue.org)
 *
 * ===============================================================================
 *
 *  Copyright (C)
 * 
 * This program is free software; you can redistribute it and/or modify it under
 * the terms of the GNU General Public License version 2, as published by the
 * Free Software Foundation. See the file LICENSE.html for more information.
 * 
 * This program is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY, including the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public License along with
 * this program; if not, write to the Free Software Foundation, Inc. / 59 Temple
 * Place, Suite 330 / Boston, MA 02111-1307 / USA.
 *
 * ===============================================================================
 */
 
package org.infoglue.cms.applications.contenttool.actions;

/**
 * The interface all implementations of the tree view must follow.
 * 
 * @author mattias
 */

public interface ViewContentTreeActionInterface
{
	public abstract void setRepositoryId(Integer repositoryId);
	public abstract Integer getRepositoryId();
	public abstract void setContentId(Integer contentId);
	public abstract Integer getContentId();
	public abstract void setHideLeafs(String hideLeafs);
	public abstract String getHideLeafs();
	public abstract String doExecute() throws Exception;
	public abstract String getTree();
	public abstract void setTree(String tree);
}