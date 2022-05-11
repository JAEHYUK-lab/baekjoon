export default {
  template: `
  <div class="container">
    <form action="#none" method="POST" id="_frmForm" name="frmForm" @submit.prevent="addboard()">
        <div class="form-group">
            <label for="userid">사용자 아이디</label>
            <input type="text" class="form-control" v-model="userid" ref="userid" id="userid"
                placeholder="Enter userid" name="userid">
        </div>
        <div class="form-group">
            <label for="subject">제목</label>
            <input type="text" class="form-control" v-model="subject" ref="subject" id="subject"
                placeholder="Enter subject" name="subject">
        </div>
        <div class="form-group">
            <label for="context">내용</label>
            <textarea class="form-control" rows="10" v-model="content" ref="content" id="content"></textarea>
        </div>

        <button type="submit" class="btn btn-primary">글쓰기</button>
    </form>
  </div>
      `,
  data() {
    return {
      userid: "",
      subject: "",
      content: "",
    };
  },
  created() {
    // 여백
  },
  methods: {
    addboard() {
      let err = true;
      let msg = "";
      !this.userid && ((msg = "작성자 입력해주세요"), (err = false), this.$ref.userid.focus());
      err &&
        !this.subject &&
        ((msg = "제목 입력해주세요"), (err = false), this.$ref.subejct.focus());
      err &&
        !this.content &&
        ((msg = "내용 입력해주세요"), (err = false), this.$ref.content.focus());

      if (!err) alert(msg);
      else this.registArticle();
    },
    registArticle() {
      axios
        .post(`http://localhost:9999/vue/board`, {
          userid: this.userid,
          subject: this.subject,
          content: this.content,
        })
        .then(({ data }) => {
          let msg = "등록 처리시 문제가 발생했습니다.";
          if (data === "success") {
            msg = "등록이 완료되었습니다.";
            alert(msg);
            this.moveList();
          } else {
            alert(msg);
            this.moveList();
          }
        });
    },
    moveList() {
      location.href = "index.html";
    },
  },
};
