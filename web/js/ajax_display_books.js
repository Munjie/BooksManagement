
function query(value) {
		//异步

		var realParam = {

			'targetPage' : value
		};

		$.post(
			           "page.do",
						realParam,
						function(data) {

							var ss = eval("(" + data + ")");
							var $tableContent = $('#tableContent');
							$($tableContent.children()).each(function() {
								$(this).remove();
							});

							for ( var key in ss) {
								var $tr = $('<tr>');
							
								var $td1 = $('<td>');
								$td1.html(ss[key].bookName);
								var $td2 = $('<td>');
								$td2.html(ss[key].author);
								var $td3 = $('<td>');
								$td3.html(ss[key].buyTime);
								var $td4 = $('<td>');
								$td4.html(ss[key].sortName);
								var $td5 = $('<td>');
								$td5.html("<input type='button' class='closeaccount' onclick=deletebook('"
												+ ss[key].bookId
												+ "') value='删除' id="+ss[key].bookId +"> ");
								$tr.append($td1);
								$tr.append($td2);
								$tr.append($td3);
								$tr.append($td4);
								$tr.append($td5);
								$tableContent.append($tr);
							}
						});
	}

	function topPage() {
		query('1');
		$('#pageNum').text(1);
	}

	function lastPage() {

		var pageNum = $('#pageCount').text() * 1;
		query(pageNum);
		$('#pageNum').text(pageNum);

	}

	function upPage() {
		var pageNum = $('#pageNum').text() * 1;
		var temp = pageNum - 1;
		query(temp);
		$('#pageNum').text(temp);
	}

	function nextPage() {
		var pageNum = $('#pageNum').text() * 1;
		var temp = pageNum + 1;
		query(temp);
		$('#pageNum').text(temp);
	}

	function goTo() {
		var pageNum = $('#inputNum').val() * 1;
		query(pageNum);
		$('#pageNum').text(pageNum);
	}