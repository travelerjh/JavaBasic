package ch15Collection.book.b3;

import java.util.ArrayList;
import java.util.List;

public class BoardDAO {
    public List<Board>  getList() {
        List<Board> list = new ArrayList<>();
        list.add(new Board("손흥민","토트넘"));
        list.add(new Board("이강인","파리"));
        list.add(new Board("김민재","뮌헨"));


      return  list;
    };
}
