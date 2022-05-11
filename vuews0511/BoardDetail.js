export default {
  template: `
    <div class="container">
        <div class="form-group">
            <label for="articleno">번호</label>
            <input type="text" class="form-control" v-model="board.articleno" ref="articleno" id="articleno"
                name="articleno">
        </div>
        <div class="form-group">
            <label for="userid">사용자 아이디</label>
            <input type="text" class="form-control" v-model="board.userid" ref="userid" id="userid"
            name="userid">
        </div>
        <div class="form-group">
            <label for="subject">제목</label>
            <input type="text" class="form-control" v-model="board.subject" ref="subject" id="subject"
                name="subject">
        </div>
        <div class="form-group">
            <label for="regtime">작성일</label>
            <input type="text" class="form-control" v-model="board.regtime" ref="regtime" id="regtime"
                name="regtime">
        </div>
        <div class="form-group">
            <label for="context">내용</label>
            <textarea class="form-control" rows="10" v-model="board.content" ref="content" id="content"></textarea>
        </div>

        <button type="submit" class="btn btn-primary">수정</button>
    </div>
        `,
  data() {
    return {
      board: {},
      articleno: "",
    };
  },
  created() {
    const params = new URL(document.location).searchParams;
    const articleno = params.get("articleno");
    this.articleno = articleno;
  },
  mounted() {
    axios
      .get(`http://localhost:9999/vue/board/${this.articleno}`)
      .then(
        ({ data }) => ((this.board = data), (this.board.regtime = data.regtime.substring(0, 10)))
      );
  },
};
