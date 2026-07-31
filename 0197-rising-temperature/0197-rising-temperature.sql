select w.id 
from Weather w
where w.temperature > (select e.temperature from Weather e where DATEDIFF(w.recordDate,e.recordDate) = 1);