package mit.arch.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Select;

import mit.arch.domain.BoardVO;

public interface BoardMapper {
	
	//@Select("SELECT * FROM item")
	public List<BoardVO> getList();
	
	public void insert(BoardVO board);
	
	public void insertSelectKey(BoardVO board);
	
	public BoardVO read(String item_code);
	
	public int delete(String item_code);
	
	public int update(BoardVO board);
}