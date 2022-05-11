export default {
  template: `
    <div class="container">
        <table class="table table-striped">
            <colgroup>
                <col width="10%">
                <col width="20%">
                <col width="20%">
                <col width="50%">
            </colgroup>
            <tr>
                <th>번호</th>
                <th>작성자</th>
                <th>작성일</th>
                <th>제목</th>
            </tr>
            <tr v-for="(board, index) in articles" :key="index">
                <td v-text="board.articleno"></td>
                <td v-text="board.userid"></td>
                <td v-text="board.regtime"></td>
                <td v-text="board.subject" @click="boarddetail(board.articleno)"></td>
            </tr>
        </table>
    </div>
      `,
  data() {
    return {
      articles: [],
    };
  },
  created() {
    axios.get("http://localhost:9999/vue/board").then(({ data }) => {
      this.articles = data;
    });
  },
  methods: {
    boarddetail(articleno) {
      //alert(articleno);
      location.href = "indexd.html?articleno=" + articleno;
    },
  },
};
