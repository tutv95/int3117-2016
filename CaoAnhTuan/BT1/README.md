#Bài tập tuần 4

##Mô tả bài toán
* Độ bao phủ: Sử dụng Tool EclEmma Java Code Coverage 2.x.x (Eclipse Tool)
* Kết quả:
	* Detail:
		![Coverage](https://github.com/ducanhk58uet/int3117-2016/blob/master/CaoAnhTuan/BT1/img/Co_Test.jpg?raw=true)
	* Code:   
		![Co_inCode](https://github.com/ducanhk58uet/int3117-2016/blob/master/CaoAnhTuan/BT1/img/Co_Code.jpg?raw=true)
	* Đồ thị: sử dụng code2flow.com
		![Flow](https://github.com/ducanhk58uet/int3117-2016/blob/master/CaoAnhTuan/BT1/img/DoThiChuTrinh.jpg?raw=true)

#Bài tập tuần 3

* Kiểm tra số được nhập có phải số điện thoại hay không
* Các điều kiện:
	* Kí tự đầu tiên phải là số ‘0’.
	* Độ dài chuỗi kí tự phải là 10 hoặc 11.
	* Kí tự trong chuỗi phải là một số.
* Chọn phương pháp kiểm thử giá trị biên

##Test cases
```       
        @Test
	public void test0() {
		SoDienThoai soDienThoai = new SoDienThoai();
		Assert.assertEquals(soDienThoai.ktraSDT("09945909&"), soDienThoai.s2);
	}

	@Test
	public void test1() {
		SoDienThoai soDienThoai = new SoDienThoai();
		Assert.assertEquals(soDienThoai.ktraSDT("01647471456"), soDienThoai.s2);
	}
	
	@Test
	public void test2() {
		SoDienThoai soDienThoai = new SoDienThoai();
		Assert.assertEquals(soDienThoai.ktraSDT("01vv3564895"), soDienThoai.s2);
	}
	
	@Test
	public void test3() {
		SoDienThoai soDienThoai = new SoDienThoai();
		Assert.assertEquals(soDienThoai.ktraSDT("123456"), soDienThoai.s2);
	}
	
	@Test
	public void test4() {
		SoDienThoai soDienThoai = new SoDienThoai();
		Assert.assertEquals(soDienThoai.ktraSDT("01%23456789"), soDienThoai.s2);
	}
	
	@Test
	public void test5() {
		SoDienThoai soDienThoai = new SoDienThoai();
		Assert.assertEquals(soDienThoai.ktraSDT("11647471456"), soDienThoai.s2);
	}
	
	@Test
	public void test6() {
		SoDienThoai soDienThoai = new SoDienThoai();
		Assert.assertEquals(soDienThoai.ktraSDT("01234567895646"), soDienThoai.s2);
	}
```

#Bài tập tuần 1
* Chương trình Java, sử dụng JUnit Test

##Hàm chức năng
```
public String ktraSDT(String s3) {
    	int i=1;
        boolean dk1 = (s3.charAt(0)=='0');
        boolean dk2 = (s3.length()==10 || s3.length()==11);

        if (dk1 && dk2){
            while (i < s3.length()) {
                if (s3.charAt(i)>=48 && s3.charAt(i)<=57){
                	i++;
                }else {
                    break;
                }
                
            }
        }
        if (i == s3.length()) {
            return s1;
        }else{
        	return s2;
        }
    }
```