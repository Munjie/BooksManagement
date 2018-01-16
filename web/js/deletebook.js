function  deletee(id){


   if (confirm("确定删除吗?")) {

       $.post("delete.do", {"bookId": id}, function (data) {

           var  t = eval('('+data+')');
           alert(t.msg);

       });
   }else {

       return false;
   }

}