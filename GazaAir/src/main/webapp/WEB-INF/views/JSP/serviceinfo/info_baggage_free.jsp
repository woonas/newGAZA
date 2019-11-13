<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
        <title>수하물</title>
        <link rel="stylesheet" href="<%=path %>/Resources/CSS/information.css">
        <script>window.onbeforeunload = () => window.scrollTo(0, 0)</script>
    </head>
    <body>
        <%@ include file="../common/nav.jspf" %>
        <%@ include file="info_nav.jspf" %>
        <section class="content info-reservation">
            <h3>수하물</h3>
            
            <div class="tab-menu1">
                <ul class="clearfix">
                    <li class="col-third on" id='tab-1'><a href="#none">무료 수하물 - 국제선</a></li>
                    <li class="col-third" id='tab-2'><a href="#none">무료 수하물 - 국내선</a></li>
                    <li class="col-third" id='tab-3'><a href="#none">회원등급별 허용량</a></li>
                </ul>
            </div>

            <div id="tab-1-container">
                <div class="info-banner">
                    <div class="banner-baggagefree-1">
                        <div>
                            <p>고객님의 편안한 여행을 위해 꼭 필요한 수하물 관련 정보를 안내해드립니다.아래에서 무료수하물 허용량을 확인할 수 있습니다.</p>
                        </div>
                    </div>
                </div>
                
                <p class="section-title">국제선 이용 시 무료수하물 허용기준</p>
				  타 항공사로 연결 시 해당 항공사의 무료수하물 허용량 기준이 당사와 상이할 수 있습니다.<br/>
				수하물 위탁은 출국장 입장 전 체크인(수속) 카운터 또는 자동 수하물 위탁 기기에서만 가능합니다.
				
				<p class="section-title">구간별 무료수하물 허용량</p>
				
            </div>

            <div id="tab-2-container"  class="hidden">
                <div class="info-banner">
                    <div class="banner-baggagefree-2">
                        <div>
                            <p class="banner-title">국제선 일반운임</p>
                            <p>국제선 일반 운임표 금액은 고객 참고용으로 사전 고지 없이 변동될 수 있습니다.
                               여행 시 부과될 수 있는 초과 수하물 요금에 대해 참고하시기 바랍니다.</p>
                            <a href="../booking/booking1.html"><button class="whiteBtn">국제선 일반운임</button></a>
                            <a href="../booking/booking1.html"><button class="whiteBtn">초과수하물 요금표</button></a>
                        </div>
                    </div>
                </div>
                <br>
                <ul class="list-type2 last-note bg-gray6">
                    <li class="list-inside-title">안내사항</li>
                    <li>유류할증료 변경 또는 환율의 영향으로 항공권 금액은 출발 및 발권일에 따라 변동 가능하오니 예매 시 확인하여 주시기 바랍니다.</li>
                    <li>운임표 금액은 사전고지 없이 변경될 수 있습니다.</li>
                    <li>항공권의 운임 및 규정, 기타 자세한 내용은 항공권 구입처 또는 아시아나항공(1588-8000/02-2669-8000)에 문의하여 주시기 바랍니다.</li>
                </ul>
            </div>
            
             <div id="tab-3-container"  class="hidden">
                <div class="info-banner">
                    <div class="banner-baggagefree-2">
                        <div>
                            <p class="banner-title">국제선 일반운임</p>
                            <p>국제선 일반 운임표 금액은 고객 참고용으로 사전 고지 없이 변동될 수 있습니다.
                               여행 시 부과될 수 있는 초과 수하물 요금에 대해 참고하시기 바랍니다.</p>
                            <a href="../booking/booking1.html"><button class="whiteBtn">국제선 일반운임</button></a>
                            <a href="../booking/booking1.html"><button class="whiteBtn">초과수하물 요금표</button></a>
                        </div>
                    </div>
                </div>
                <br>
                <ul class="list-type2 last-note bg-gray6">
                    <li class="list-inside-title">안내사항</li>
                    <li>유류할증료 변경 또는 환율의 영향으로 항공권 금액은 출발 및 발권일에 따라 변동 가능하오니 예매 시 확인하여 주시기 바랍니다.</li>
                    <li>운임표 금액은 사전고지 없이 변경될 수 있습니다.</li>
                    <li>항공권의 운임 및 규정, 기타 자세한 내용은 항공권 구입처 또는 아시아나항공(1588-8000/02-2669-8000)에 문의하여 주시기 바랍니다.</li>
                </ul>
            </div>
        </section>
        <%@ include file="../common/footer.jspf" %>
        <script src="<%=path %>/Resources/JS/information.js"></script>
    </body>
</html>