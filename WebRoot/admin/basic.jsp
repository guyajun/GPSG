<%@ page contentType="text/html;charset=gb2312"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3c.org/TR/1999/REC-html401-19991224/loose.dtd">
<html>
<head>
<title>��Ƭ����������Ϣϵͳ</title>
<link href="../css/produce.css" rel="stylesheet" type="text/css" />
<link rel="stylesheet" type="text/css"
	href="../themes/default/easyui.css">
<link rel="stylesheet" type="text/css" href="../themes/icon.css">
<link rel="stylesheet" type="text/css" href="../css/demo.css">
<script type="text/javascript" src="../js/jquery-1.8.0.min.js"></script>
<script type="text/javascript" src="../js/jquery.easyui.min.js"></script>
<script type="text/javascript">
	function save() {
		$('#ff2').submit();
	}
</script>
</head>

<body>
	<jsp:include page="../produce/produce_head.jsp"></jsp:include>
	<div class="box-left">
		<div title="��������" style="width:170px;padding:10px;overflow:hidden;">
			<ul class="easyui-tree">
				<s:action name="testMenu" executeResult="true" />
			</ul>
		</div>
	</div>
	<div style="margin:0px 0;"></div>
	<div id="tt" class="easyui-panel"
		style="auto;height:768px; padding:0px;">
		<div class="easyui-tabs" style="width:auto;">
			<div title="���Ź���" style="padding:0px 0 10px 0px">
				<form id="ff2" method="post">
					<table>
						<tr>
							<td>֤������:</td>
							<td><input class="easyui-validatebox" style="width:250px;"
								type="text" name="uid"></input>
							</td>
							<td>�ֽ���(��):</td>
							<td><select id="cc" class="easyui-combobox" name="state"
								style="width:250px;">
									<option value="001">6</option>
									<option value="002">10</option>
									<option value="003">12</option>
									<option value="004">16</option>
									<option value="005">18</option>
									<option value="006">20</option>
									<option value="007">22</option>
									<option value="008">25</option>
									<option value="009">28</option>
									<option value="010">32</option>
							</select></td>
						</tr>
						<tr></tr>

						<tr></tr>
						<tr>
							<td>��������(t):</td>
							<td><input id="cc" class="easyui-validatebox" name="state"
								style="width:250px;" /></td>
							<td>��������:</td>
							<td><select id="cc" class="easyui-combobox" name="state"
								style="width:250px;">
									<option value="AL">�Ϻ������͸����޹�˾</option>
									<option value="AK">��˾1</option>
									<option value="AZ">��˾2</option>
									<option value="OH">��˾3</option>

							</select></td>

						</tr>
						<tr></tr>
						<tr></tr>
						<tr>
							<td>��������:</td>
							<td><input id="dd" class="easyui-datebox"
								style="width:250px;"></input>
							</td>
							<td>�ջ���:</td>
							<td><select id="cc" class="easyui-combobox" name="state"
								style="width:250px;">
									<option value="AL" selected>������</option>
									<option value="AK">�</option>
							</select></td>
						</tr>
						<tr>
							<td>Ͷ��ʹ������:</td>
							<td><input id="dd" class="easyui-datebox"
								style="width:250px;"></input>
							</td>

							<td>�ϴ��ļ���</td>
							<td><input name="imgfile" type="file" id="imgfile" size="40"
								style="width:320px;"
								onchange="viewmypic(showimg,this.form.imgfile);" />
							</td>
						</tr>
					</table>
				</form>
				<div style="padding:5px">
					<a class="easyui-linkbutton" onclick="save();">����</a>
				</div>

				<br />
				<div class="easyui-panel" title="ͼƬԤ��"
					style="width:auto;height:700px;">
					<img name="showimg" id="showimg" src=""
						style="display:none;width:700px;height:600px;" alt="Ԥ��ͼƬ" />
				</div>


			</div>


			<div title="�ֽ�ԭ���ϼ�ⱨ��" style="padding:0px 0 10px 0px">
				<form id="ff2" method="post">
					<table height="226">
						<tr>
							<td width="100">�ļ��ϴ�</td>
							<td><input name="imgfile" type="file" id="imgfile"
								onchange="viewmypic(showimg2,this.form.imgfile);" />
							</td>
							<td width="100">������:</td>
							<td width="142"><input class="easyui-validatebox"
								type="text" name="uid"></input>
							</td>
							<td width="100">��Ӧ����֤������:</td>
							<td width="142">
							<select class="easyui-combobox"  style="width:130px;" name="uid"></select>
							</td>
						</tr>
						<tr>
							<td>����ǿ�ȱ�׼:</td>
							<td><input class="easyui-validatebox" type="text" name="uid"></input>
							</td>
							<td>����ǿ��ʵ��:</td>
							<td><input class="easyui-validatebox" type="text"
								name="name"></input>
							</td>
							<td width="120">����ǿ���Ƿ�ϸ�</td>
							<td><input class="easyui-validatebox" type="text"
								name="name"></input>
							</td>
						</tr>
						<tr></tr>
						<tr>
							<td>�Ϻ��쳤�ʱ�׼:</td>
							<td><input class="easyui-validatebox" type="text" name="uid"></input>
							</td>
							<td>�Ϻ��쳤��ʵ��:</td>
							<td><input class="easyui-validatebox" type="text"
								name="name"></input>
							</td>
							<td width="120">�Ϻ��쳤���Ƿ�ϸ�</td>
							<td><input class="easyui-validatebox" type="text"
								name="name"></input>
							</td>
						</tr>
						<tr></tr>
						<tr>
							<td>����ǿ�ȱ�׼:</td>
							<td><input class="easyui-validatebox" type="text" name="uid"></input>
							</td>
							<td>����ǿ��ʵ��:</td>
							<td><input class="easyui-validatebox" type="text"
								name="name"></input>
							</td>
							<td width="120">����ǿ���Ƿ�ϸ�</td>
							<td><input class="easyui-validatebox" type="text"
								name="name"></input>
							</td>
						</tr>
						<tr></tr>
						<tr>
							<td>�������ܱ�׼:</td>
							<td><input class="easyui-validatebox" type="text" name="uid"></input>
							</td>
							<td>��������ʵ��:</td>
							<td><input class="easyui-validatebox" type="text"
								name="name"></input>
							</td>
							<td width="120">���������Ƿ�ϸ�</td>
							<td><input class="easyui-validatebox" type="text"
								name="name"></input>
							</td>
						</tr>
						<tr></tr>
						<tr>
							<td>����ƫ��ֵ��׼:</td>
							<td><input class="easyui-validatebox" type="text" name="uid"></input>
							</td>
							<td>����ƫ��ֵʵ��:</td>
							<td><input class="easyui-validatebox" type="text"
								name="name"></input>
							</td>
							<td width="120">����ƫ��ֵ�Ƿ�ϸ�</td>
							<td><input class="easyui-validatebox" type="text"
								name="name"></input>
							</td>
						</tr>
						<tr></tr>
						<tr>
							<td>�� �� Ա:</td>
							<td><input class="easyui-validatebox" type="text"
								name="role"></input>
							</td>
						</tr>
					</table>
				</form>
				<div style="padding:5px">
					<a href="javascript:void(0)" class="easyui-linkbutton">����</a> <a
						href="javascript:void(0)" class="easyui-linkbutton">���</a>
				</div>
				<br />

				<div class="easyui-panel" title="ͼƬԤ��"
					style="width:auto;height:700px;">
					<img name="showimg2" id="showimg2" src=""
						style="display:none;width:700px;height:600px;" alt="Ԥ��ͼƬ" />
				</div>
			</div>
		</div>
	</div>
</body>
</html>
