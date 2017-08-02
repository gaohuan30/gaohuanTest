package com.gaohuan;

import com.gaohuan.excel.controller.FileController;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class OneExcelHtmlApplicationTests {

	@Test
	public void contextLoads() {
		FileController fileController = new FileController();
		fileController.readExcel();
	}

}
