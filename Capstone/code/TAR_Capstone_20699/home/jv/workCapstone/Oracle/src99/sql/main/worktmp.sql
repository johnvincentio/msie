
create or replace package WORKTMP_PKG IS
	procedure addNextWorktmp (p_barcodeid IN WORKTMP.barcodeid%TYPE,
					p_itemid IN WORKTMP.itemid%TYPE,
					p_company IN WORKTMP.company%TYPE,
					p_imageurl IN WORKTMP.imageurl%TYPE,
					p_itemname IN WORKTMP.itemname%TYPE,
					p_itemds IN WORKTMP.itemds%TYPE);
END WORKTMP_PKG;

/
SHOW ERROR;

create or replace package body WORKTMP_PKG IS

	procedure addNextWorktmp (p_barcodeid IN WORKTMP.barcodeid%TYPE,
					p_itemid IN WORKTMP.itemid%TYPE,
					p_company IN WORKTMP.company%TYPE,
					p_imageurl IN WORKTMP.imageurl%TYPE,
					p_itemname IN WORKTMP.itemname%TYPE,
					p_itemds IN WORKTMP.itemds%TYPE) IS
		v_id NUMBER;
	BEGIN
		select WORKTMP_SEQ.NEXTVAL into v_id from dual;
		insert into WORKTMP values (v_id, p_barcodeid, p_itemid, 
				p_company, p_imageurl, p_itemname, p_itemds);
	END;

END WORKTMP_PKG;

/
SHOW ERROR;

