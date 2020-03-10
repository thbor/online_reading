package com.yyjj.reading.service.bo;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.yyjj.reading.db.model.ReadingRecord;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.BeanUtils;

@Getter
@Setter
public class ReadingRecordBO implements IBaseBO<ReadingRecord>{
	
	@Override
	public void accpet(QueryWrapper<ReadingRecord> queryWrapper) {
		
	}
	
	public  ReadingRecord convert() {
  		 ReadingRecord  readingrecord = new  ReadingRecord();
  	  BeanUtils.copyProperties(this,  readingrecord);
  	  return  readingrecord;
  	}
}
    