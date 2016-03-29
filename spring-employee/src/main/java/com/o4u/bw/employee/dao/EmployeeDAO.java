package com.o4u.bw.employee.dao;

import java.util.List;

import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.stereotype.Repository;

import com.o4u.bw.employee.model.Employee;

@Repository
public class EmployeeDAO extends SqlSessionDaoSupport {

	@SuppressWarnings("unchecked")
	public List<Employee> selectList() {
		return getSqlSession().selectList("employee.selectList");
	}

	public Employee select(Employee employee) {
		return (Employee) getSqlSession()
				.selectOne("employee.select", employee);
	}

	public void insert(Employee employee) {
		getSqlSession().insert("employee.insert", employee);

	}

	public void update(Employee employee) {
		getSqlSession().update("employee.update", employee);

	}

	public void delete(Employee employee) {
		getSqlSession().delete("employee.delete", employee);

	}

}
