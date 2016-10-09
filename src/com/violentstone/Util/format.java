package com.violentstone.Util;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class format {

		/** 
		* 检查 email输入是否正确 
		* 正确的书写格 式为 username@domain 
		* @param value 
		* @return 
		*/ 
		public static boolean checkEmail(String value, int length) { 
		return value.matches("\\w+([-+.]\\w+)*@\\w+([-.]\\w+)*\\.\\w+([-.]\\w+)*")&&value.length()<=length; 
		} 

		/** 
		* 检查电话输入 是否正确 
		* 正确格 式 012-87654321、0123-87654321、0123－7654321 
		* @param value 
		* @return 
		*/ 
		public static boolean checkTel(String value) { 
		return value.matches("\\d{4}-\\d{8}|\\d{4}-\\d{7}|\\d(3)-\\d(8)"); 
		} 

		/** 
		* 检查手机输入 是否正确 
		* 
		* @param value 
		* @return 
		*/ 
		public static boolean checkMobile(String mobiles){
			Pattern p = Pattern.compile("^((13[0-9])|(15[^4,\\D])|(18[0,5-9]))\\d{8}$");
			Matcher m = p.matcher(mobiles);
			return m.matches();
		}

		/** 
		* 检查中文名输 入是否正确 
		* 
		* @param value 
		* @return 
		*/ 
		public  static boolean checkChineseName(String value,int start,int end) { 
		return value.matches("^[\u4e00-\u9fa5]+$")&&value.length()<=end&&value.length()>=start; 
		} 
		/** 
		* 检查HTML 中首尾空行或空格 
		* @param value 
		* @return 
		*/ 
		public static boolean checkBlank(String value){ 
		return value.matches("^\\s*|\\s*$"); 
		}
		/**
		 *取出HTML中的所有空格
		 */
		public static String clearEmpty(String value){ 
		return value.replace(" ", ""); 
		}	    
		/** 
		* 检查字符串是 否含有HTML标签 
		* @param value 
		* @return 
		*/ 

		public static boolean checkHtmlTag(String value){ 
		return value.matches("<(\\S*?)[^>]*>.*?</\\1>|<.*? />"); 
		} 
		/** 
		* 检查URL是 否合法 
		* @param value 
		* @return 
		*/ 
		public static boolean checkURL(String value){ 
		return value.matches("[a-zA-z]+://[^\\s]*"); 
		} 
		/** 
		* 检查IP是否 合法 
		* @param value 
		* @return 
		*/ 
		public static boolean checkIP(String value){ 
		return value.matches("\\d{1,3}+\\.\\d{1,3}+\\.\\d{1,3}+\\.\\d{1,3}"); 
		} 
		/** 
		* 检查ID是否 合法，开头必须是大小写字母，其他位可以有大小写字符、数字、下划线 
		* @param value 
		* @return 
		*/ 
		public static boolean checkID(String value){ 
		return value.matches("[a-zA-Z][a-zA-Z0-9_]{4,15}$"); 
		} 
		/** 
		* 检查QQ是否 合法，必须是数字，且首位不能为0，最长15位 
		* @param value 
		* @return 
		*/ 

		public static boolean checkQQ(String value){ 
		return value.matches("[1-9][0-9]{4,13}"); 
		} 
		/** 
		* 检查邮编是否 合法 
		* @param value 
		* @return 
		*/ 
		public static boolean checkPostCode(String value){ 
		return value.matches("[1-9]\\d{5}(?!\\d)"); 
		} 
		/** 
		* 检查身份证是 否合法,15位或18位 
		* @param value 
		* @return 
		*/ 
		public static boolean checkIDCard(String value){ 
		return value.matches("\\d{15}|\\d{18}"); 
		} 
		/** 
		* 检查输入是否 超出规定长度 
		* @param length 
		* @param value 
		* @return 
		*/ 
		public static boolean checkLength(String value, int length) { 
		return ((value == null || "".equals(value.trim())) ? 0 : value.length()) <= length; 
		} 

		/** 
		* 检查是否为空 字符串,空：true,不空:false 
		* 
		* @param value 
		* @return 
		*/ 
		public static boolean checkNull(String value){ 
		return value == null || "".equals(value.trim()); 
		} 
		
		
		/**
		 * 检查所有的字符串是否都不为空, 都不为空:true,有任意一个为空:false.
		 * @param 可变参数arg0
		 * @return
		 */
		public static boolean checkAllString(String ...arg0){
			
			for (String string : arg0) {
				if(checkNull(string))
					return false;
			}
			return true;			
		}
}
