package dao;

import model.Users;

public interface UserDAO {
	//��¼�����ܣ��жϣ��û��������������ݿ����Ƿ����
	//��������findLongin
	//�������в������û��������룻
	//����ֵ������ true false
	public boolean findLogin(Users user) throws Exception;
		
		
}
