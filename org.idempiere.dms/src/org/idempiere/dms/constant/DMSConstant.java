/******************************************************************************
 * Copyright (C) 2016 Logilite Technologies LLP								  *
 * This program is free software; you can redistribute it and/or modify it    *
 * under the terms version 2 of the GNU General Public License as published   *
 * by the Free Software Foundation. This program is distributed in the hope   *
 * that it will be useful, but WITHOUT ANY WARRANTY; without even the implied *
 * warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.           *
 * See the GNU General Public License for more details.                       *
 * You should have received a copy of the GNU General Public License along    *
 * with this program; if not, write to the Free Software Foundation, Inc.,    *
 * 59 Temple Place, Suite 330, Boston, MA 02111-1307 USA.                     *
 *****************************************************************************/

package org.idempiere.dms.constant;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.regex.Pattern;

import org.compiere.model.MSysConfig;
import org.compiere.util.Env;
import org.compiere.util.Msg;
import org.idempiere.dms.factories.Utils;

/**
 * DMS Constant
 * 
 * @author Sachin
 */
public final class DMSConstant
{

	public static final int					MAX_FILENAME_LENGTH					= 250;

	// Content widget size
	public static final int					CONTENT_COMPONENT_HEIGHT			= 120;
	public static final int					CONTENT_COMPONENT_WIDTH				= 120;

	// Regular Expression
	public static final String				REG_EXP_FILENAME					= "^[A-Za-z0-9\\s\\-\\._\\(\\)]+$";
	public static final String				REG_SPACE							= "\\S+";
	public static final String				REG_EXP_WINDOWS_DIRNAME_VALIDATE	= "((^(CON|PRN|AUX|NUL|COM[0-9]|LPT[0-9])$)|([\\\\//:*?\\\"<>|?*\\x00-\\x1F]))";
	public static final String				REG_EXP_LINUX_DIRNAME_VALIDATE		= "(/)";

	// Pattern
	public static final Pattern				PATTERN_WINDOWS_DIRNAME_ISVALID		= Pattern.compile(REG_EXP_WINDOWS_DIRNAME_VALIDATE);
	public static final Pattern				PATTERN_LINX_DIRNAME_ISVALID		= Pattern.compile(REG_EXP_LINUX_DIRNAME_VALIDATE);

	// File Separator
	public static final String				STORAGE_PROVIDER_FILE_SEPARATOR		= "STORAGE_PROVIDER_FILE_SEPARATOR";
	public static final String				FILE_SEPARATOR						= Utils.getStorageProviderFileSeparator();

	// Button
	public static final String				TOOLBAR_BUTTON_DOCUMENT_EXPLORER	= "Document Explorer";

	// Context Menu Item
	public static final String				MENUITEM_UPLOADVERSION				= "Upload Version";
	public static final String				MENUITEM_VERSIONlIST				= "Version List";
	public static final String				MENUITEM_RENAME						= "Rename";
	public static final String				MENUITEM_CUT						= "Cut";
	public static final String				MENUITEM_COPY						= "Copy";
	public static final String				MENUITEM_PASTE						= "Paste";
	public static final String				MENUITEM_DOWNLOAD					= "Download";
	public static final String				MENUITEM_CREATELINK					= "Create Link";
	public static final String				MENUITEM_DELETE						= "Delete";
	public static final String				MENUITEM_ASSOCIATE					= "Associate";

	// DMS MimeType
	public static final String				DEFAULT								= "Default";
	public static final String				DIRECTORY							= "Directory";

	// AD_Image
	public static final String				DOWNLOAD							= "Download";

	// constant for index fields
	public static final String				NAME								= "Name";
	public static final String				CREATED								= "created";
	public static final String				UPDATED								= "updated";
	public static final String				CREATEDBY							= "createdBy";
	public static final String				UPDATEDBY							= "updatedBy";
	public static final String				RECORD_ID							= "Record_ID";
	public static final String				AD_Table_ID							= "AD_Table_ID";
	public static final String				DESCRIPTION							= "description";
	public static final String				CONTENTTYPE							= "contentType";
	public static final String				DMS_CONTENT_ID						= "DMS_Content_ID";
	public static final String				SHOW_INACTIVE						= "Show_InActive";
	public static final String				AD_CLIENT_ID						= "AD_Client_ID";

	// Msg translate
	public static final String				MSG_NAME							= Msg.translate(Env.getCtx(), "Name");
	public static final String				MSG_CREATED							= Msg.translate(Env.getCtx(), "Created");
	public static final String				MSG_UPDATED							= Msg.translate(Env.getCtx(), "Updated");
	public static final String				MSG_FILESIZE						= Msg.translate(Env.getCtx(), "FileSize");
	public static final String				MSG_CREATEDBY						= Msg.translate(Env.getCtx(), "CreatedBy");
	public static final String				MSG_UPDATEDBY						= Msg.translate(Env.getCtx(), "UpdatedBy");
	public static final String				MSG_DESCRIPTION						= Msg.translate(Env.getCtx(), "Description");
	public static final String				MSG_CONTENT_TYPE					= Msg.translate(Env.getCtx(), "Content Type");
	public static final String				MSG_CONTENT_META					= Msg.translate(Env.getCtx(), "Content Meta");
	public static final String				MSG_FILL_MANDATORY					= Msg.translate(Env.getCtx(), "FillMandatory");
	public static final String				MSG_ADVANCE_SEARCH					= Msg.translate(Env.getCtx(), "Advance Search");
	public static final String				MSG_DIRECTORY_NAME					= Msg.translate(Env.getCtx(), "Directory Name");
	public static final String				MSG_DMS_CONTENT_TYPE				= Msg.translate(Env.getCtx(), "DMS_ContentType_ID");

	// Msg
	public static final String				MSG_RENAME							= Msg.getMsg(Env.getCtx(), "Rename");
	public static final String				MSG_EXPLORER						= Msg.getMsg(Env.getCtx(), "Explorer");
	public static final String				MSG_ATTRIBUTES						= Msg.getMsg(Env.getCtx(), "Attributes");
	public static final String				MSG_SELECT_FILE						= Msg.getMsg(Env.getCtx(), "SelectFile");
	public static final String				MSG_ATTRIBUTE_SET					= Msg.getMsg(Env.getCtx(), "attribute.set");
	public static final String				MSG_UPLOAD_CONTENT					= "Upload Content";
	public static final String				MSG_VERSION_HISTORY					= "Version History";
	public static final String				MSG_DMS_VERSION_LIST				= "DMS Version List";
	public static final String				MSG_CREATE_DIRECTORY				= "Create Directory";
	public static final String				MSG_ENTER_DIRETORY_NAME				= "Enter Directory Name";
	public static final String				MSG_NO_VERSION_DOC_EXISTS			= "No version Document available.";
	public static final String				MSG_ENTER_NEW_NAME_FOR_ITEM			= "Please enter a new name for the item:";

	// ToolTipText
	public static final String				TTT_SAVE							= "Save";
	public static final String				TTT_EDIT							= "Edit";
	public static final String				TTT_DOWNLOAD						= "Download";
	public static final String				TTT_UPLOAD_VERSION					= "Upload Version";

	// System Configuration
	public static final String				DMS_MOUNTING_BASE					= MSysConfig.getValue("DMS_MOUNTING_BASE", "Attachment");
	public static final String				DMS_MOUNTING_ARCHIVE_BASE			= MSysConfig.getValue("DMS_MOUNTING_ARCHIVE_BASE", "Archive");

	// Date Format
	public static final SimpleDateFormat	SDF									= new SimpleDateFormat("yyyy-MM-dd hh:mm z");
	public static final SimpleDateFormat	sdfWithTime							= new SimpleDateFormat("yyyy-MM-dd hh:mm:ss.SSS");
	public static final DateFormat			dateFormatWithTime					= new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'");

	// CSS Style
	public static final String				STYLE_CONTENT_COMP_VIEWER_NORMAL	= "background-color:#ffffff; box-shadow: 7px 7px 7px #ffffff";
	public static final String				STYLE_CONTENT_COMP_VIEWER_SELECTED	= "background-color:#99cbff; box-shadow: 7px 7px 7px #888888";

	// Queries
	public static final String				SQL_GET_CONTENT_LATEST_VERSION		= "SELECT DMS_Content_ID, DMS_Association_ID FROM DMS_Association "
																						+ "WHERE DMS_Content_Related_ID = ? OR DMS_Content_ID = ? "
																						+ "GROUP BY DMS_Content_ID, DMS_Association_ID 	ORDER BY MAX(SeqNo) DESC ";

	public static final String				SQL_GET_ASSOCIATION_ID_FROM_CONTENT	= "SELECT DMS_Association_ID FROM DMS_Association WHERE DMS_Content_ID = ? ORDER BY Created";

	public static final String				SQL_GET_CONTENTID_FROM_CONTENTNAME	= "SELECT DMS_Content_ID FROM DMS_Content WHERE Name = ? AND AD_Client_ID = ?";

	public static final String				SQL_GET_MOUNTING_BASE_CONTENT		= "SELECT DMS_Content_ID FROM DMS_Content WHERE Name = ? AND AD_Client_ID = ? AND ContentBaseType = 'DIR' AND ParentUrl IS NULL";

	public static final String				SQL_GET_MOUNTING_CONTENT_FOR_TABLE	= "SELECT dc.DMS_Content_ID FROM DMS_Content dc "
																						+ " INNER JOIN DMS_Association da ON (dc.DMS_Content_ID = da.DMS_Content_ID) "
																						+ " WHERE dc.Name = ? AND dc.IsMounting = 'Y' AND da.AD_Table_ID = ? AND da.Record_ID = ?";

	public static final String				SQL_FETCH_CONTENT_VERSION_LIST		= "SELECT DISTINCT DMS_Content_ID, SeqNo FROM DMS_Association a WHERE DMS_Content_Related_ID = ? AND a.DMS_AssociationType_ID = ? "
																						+ " UNION "
																						+ "SELECT DMS_Content_ID, null FROM DMS_Content WHERE DMS_Content_ID = ? AND ContentBaseType <> 'DIR' ORDER BY DMS_Content_ID DESC";

}